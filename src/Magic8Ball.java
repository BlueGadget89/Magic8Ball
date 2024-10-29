import java.util.Random;

/**
 * Represents a Magic 8 Ball that provides random answers to questions.
 * This class allows for both default and custom sets of answers.
 */
public class Magic8Ball
{
    private static final String[] DEFAULT_ANSWERS =
    {
      "It is certain",
      "It is decidedly so",
      "Yes",
      "As I see it yes",
      "Without a doubt",
      "Yes definitely",
      "You may rely on it",
      "Most likely",
      "Outlook good",
      "Signs point to yes",
      "Reply hazy, try again",
      "Ask again later",
      "Better not tell you now",
      "Cannot predict now",
      "Concentrate and ask again",
      "Don't count on it",
      "My reply is no",
      "My sources say no",
      "Outlook not so good",
      "Very doubtful"
    };

    private final Random random = new Random();
    private final String[] answers;

    /**
     * Create a Magic8Ball object with the default set of answers.
     */
    public Magic8Ball()
    {
        this(DEFAULT_ANSWERS);
    }

    /**
     * Create a Magic8Ball object with the specified set of answers.
     *
     * @param answers An array  of the set of answers for the Magic8Ball
     * @throws IllegalArgumentException if answers is null or empty
     */
    public Magic8Ball(String[] answers) throws IllegalArgumentException
    {
        if (answers == null || answers.length == 0)
        {
            throw new IllegalArgumentException("Answers array cannot be null or empty");
        }
        //System.arraycopy() is more efficient
        //but manual array copy since I understand it better
        this.answers = new String[answers.length];
        for (int i = 0; i < answers.length; i++)
        {
            this.answers[i] = answers[i];
        }
    }

    /**
     * Return a random answer from the set of answers provided to the constructor.
     *
     * @return a random answer as a String
     */
    public String getAnswer()
    {
        int index = random.nextInt(answers.length);
        return answers[index];
    }
}
