package processing.mode.java.preproc.util.strategy;

public class BadParamMessageSimplifierStrategy
    extends RegexTemplateMessageSimplifierStrategy {

  @Override
  public String getRegexPattern() {
    return "([a-zA-Z0-9_]+\\s*,|[a-zA-Z0-9_]\\))";
  }

  @Override
  public String getMessageTemplate() {
    return "Issue with parameter near '%s'?";
  }

}
