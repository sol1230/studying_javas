package beans;

public class DataInfo {

  public MemberBean getDataWithMemberBean() {
    MemberBean memberBean = new MemberBean();
    memberBean.setFirstName("Mark");
    memberBean.setSecondName("Otto");
    memberBean.setHandleName("@mdo");

    return memberBean;
  }
}
