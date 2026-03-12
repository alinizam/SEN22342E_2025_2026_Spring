package Week05Lab.Quiz;

class MultipleChoiceQuestion implements Question {

    @Override
    public Question clone() {
        try {
                return (Question)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

