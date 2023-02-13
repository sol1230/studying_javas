package beans;

public class BeansMain {

  public static void main(String[] args) {
    DataInfo dataInfo = new DataInfo();
    MemberBean memberBean = dataInfo.getDataWithMemberBean();

    System.out.println(
      memberBean.getFirstName() +
      " " +
      memberBean.getSecondName() +
      " " +
      memberBean.getHandleName()
    );
  }
}
