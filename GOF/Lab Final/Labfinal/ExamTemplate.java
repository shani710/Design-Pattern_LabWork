public abstract class ExamTemplate {
    public final void examiner() {

        buildQuestions();
        conductExam();
        evaluateResults();
    }

    protected abstract void buildQuestions();

    protected abstract void conductExam();

    protected abstract void evaluateResults();
}