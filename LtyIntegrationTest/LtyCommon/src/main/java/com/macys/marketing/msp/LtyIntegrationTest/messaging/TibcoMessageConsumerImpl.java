package com.macys.marketing.msp.LtyIntegrationTest.messaging;

import java.util.LinkedList;
import java.util.Queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.macys.platform.messaging.client.exception.MessagingClientRuntimeException;
import com.macys.platform.messaging.client.tibco.processer.TibcoEmsConsumerInterface;
import com.macys.platform.messaging.client.util.AcknowledgeMode;

/**
 * 
 * @author rmarla
 * This class is for consume messages from tibco message queue
 *
 */
@Component
public class TibcoMessageConsumerImpl implements TibcoEmsConsumerInterface {

	private Logger log = LoggerFactory.getLogger(TibcoMessageConsumerImpl.class);
	private String acknowledgeMode;
	
	private static Queue<String> messageQueue = new LinkedList<String>();
	
	@Override
	public void setApplicationContext(ApplicationContext appContext) {
		log.info("setApplicationContext {} acknowledgeMode {}"+appContext, acknowledgeMode);
		acknowledgeMode = (String) appContext.getBean("acknowledgeMode");

	}

	/**
	 * Receives messages from M.MKT.LTY.EVENTBUS.OfferToolUpdate.Receive
	 */

	@Override
	public void onMessage(Message message) throws MessagingClientRuntimeException {
		log.info("Start  LtyOfferMessageConsumer : onMessage : acknowledgeMode {} | {}", acknowledgeMode, message);
		try {
			String stringMessage = getStringMessage(message);
			log.info("message {}", stringMessage);
			if (StringUtils.equals(acknowledgeMode, AcknowledgeMode.CLIENT_ACKNOWLEDGE.name())) {
				message.acknowledge();
				
				//Add to Message queue for further processing
				messageQueue.add(stringMessage);
				
				log.info("Start LtyOfferMessageConsumer.acknowledge... : {}", messageQueue);
			}

		} catch (JMSException je) {
            log.error("Error while converting jms Message::Message ::{}, jmsexception: {}", new Object[]{message, je});
		}catch (Exception e) {
			log.error("Exception while processing ltyOffers subcriptions message : {}, exception:{}",
					new Object[] { message, e });
		}
		log.info("End LtyOfferMessageConsumer : onMessage : ");

	}
	
	/**
     * Used to convert test message from message object
     *
     * @param message
     * @return returns String message
     * @throws JMSException
     */
    private String getStringMessage(Message message) throws JMSException {

        if (message instanceof TextMessage) {
            TextMessage msg = (TextMessage) message;
            return msg.getText();
        }
        return null;
    }

	@Override
	public void isEnableLogging(boolean logFlag) {

	}

	public Queue<String> getMessageQueue() {
		return messageQueue;
	}
	
	public boolean clearMessageQueue(){
		messageQueue.clear();
		
		return (messageQueue.size() == 0)?true:false;
			
	}
	
	

}
