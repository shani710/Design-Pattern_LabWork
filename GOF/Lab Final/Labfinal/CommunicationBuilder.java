public interface CommunicationBuilder {
    void buildMessage();

    void buildAnnouncement();

    void buildNotification();

    void buildSurvey();

    void buildPolling();

    Object getResult();
}