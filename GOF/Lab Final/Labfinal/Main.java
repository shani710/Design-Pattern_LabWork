public class Main {
    public static void main(String[] args) {

        Settings settings = Settings.getInstance();

        MessageSender mediator = new MessageSender();
        mediator.mediate();

        Facade facade = new Facade();
        facade.easyInterface();

        CommunicationStrategy strategy = new CommunicationStrategy() {
            @Override
            public void adoptStrategy() {

            }
        };
        strategy.adoptStrategy();

        CommunicationBuilder builder = new CommunicationBuilder() {
            @Override
            public void buildMessage() {

            }

            @Override
            public void buildAnnouncement() {

            }

            @Override
            public void buildNotification() {

            }

            @Override
            public void buildSurvey() {

            }

            @Override
            public void buildPolling() {

            }

            @Override
            public Object getResult() {
                return null;
            }
        };
        builder.buildMessage();
        builder.buildAnnouncement();
        builder.buildNotification();
        builder.buildSurvey();
        builder.buildPolling();
        Object result = builder.getResult();

        StakeholderIterator iterator = new StakeholderIterator();
        iterator.iterate();

        ExamBuilder examBuilder = new ExamBuilder();
        examBuilder.builMCQS();
        examBuilder.builMatchingQuestions();
        examBuilder.buildShortQuestions();

        ExamTemplate examTemplate = new ExamTemplate() {
            @Override
            protected void buildQuestions() {

            }

            @Override
            protected void conductExam() {

            }

            @Override
            protected void evaluateResults() {

            }
        };
        examTemplate.examiner();
        CommunicationObserver observer = new CommunicationObserver() {
            @Override
            public void update() {

            }
        };
        RealTimeCommunication realTimeCommunication = new RealTimeCommunication();
        realTimeCommunication.notifyObservers();
    }
}