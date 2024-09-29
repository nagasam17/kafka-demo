package com.example.kakfa.demo.model;

public enum Topic {


    PERSON_TOPIC("PERSON_TOPIC", "CONSUMER"),
    CUSTOMER_ODD_TOPIC("CUSTOMER_ODD_TOPIC", "PRODUCER"),
    CUSTOMER_EVEN_TOPIC("CUSTOMER_EVEN_TOPIC", "PRODUCER");

    private String topicName;
    private String topicType;

    public String getTopicName() { return topicName; }
    public String getTopicType() { return topicType; }

    public void setTopicName(String tName) {
        topicName = tName;
    }
    public void setTopicType(String tType){
        topicType = tType;
    }

    Topic(String tName,String tType){
        this.topicName = tName;
        this.topicType = tType;
    }

}
