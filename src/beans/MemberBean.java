package beans;

public class MemberBean {
  private String firstName;
  private String secondName;
  private String handleName;

  public MemberBean(String firstName, String secondNamem, String handleName) {
    this.firstName = firstName;
    this.secondName = secondNamem;
    this.handleName = handleName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getHandleName() {
    return handleName;
  }

  public void setHandleName(String handleName) {
    this.handleName = handleName;
  }
}
