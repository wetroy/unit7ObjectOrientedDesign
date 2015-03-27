
public class ChoiceQuestion
{
    public ChoiceQuestion()
    {
        super();
        numberOfChoices = 0;
    }
    public void addChoice(String choice, boolean correct)
    {
        numberOfChoices++;
        
        super.addText("\n" + numberOfChoices + ")" + choice);
        if(correct)
        {
            String answerString = "" + numberOfChoices;
            super.setAnswer(answerString);
        }
    }
}
