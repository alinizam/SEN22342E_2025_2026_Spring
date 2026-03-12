package Week05Lab.Quiz;

class QuestionFactory {
    static Question prototype;
    static {
        prototype=new MultipleChoiceQuestion();
    }
    public static Question createQuestion(){
        return (Question)prototype.clone();
    }
}

