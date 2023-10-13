/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Example;

/**
 *
 * @author FA20-BSE-062
 */
public class Message {

    String description;
    MessageType messageType;
    NetworkType netwrokType;

    public Message(String description, MessageType messageType, NetworkType netwrokType) {
        this.description = description;
        this.messageType = messageType;
        this.netwrokType = netwrokType;

    }

    public String getDescription() {
        return description;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public NetworkType getNetwrokType() {
        return netwrokType;
    }

    public String toString() {

        return "Message{" +
                "description='" + description + '\'' +
                ", messageType=" + messageType +
                ", netwrokType=" + netwrokType +
                '}';

    }

}