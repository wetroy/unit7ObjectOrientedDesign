

/**
 * Write a description of class NumericQuest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumericQuestion
{
    private double answer;
    public NumericQuestion()
    {
        
    }
    public void setAnswer(double correctResponse)
    {
        answer = correctResponse;
    }
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        return Math.abs(responseAsDouble - answer) <= 0.01;
    }
}
