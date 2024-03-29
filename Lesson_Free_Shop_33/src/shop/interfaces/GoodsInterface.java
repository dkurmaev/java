package shop.interfaces;

public interface GoodsInterface {

    double getPrice();

    boolean hasGuarantee();

    String getName();

    DepartmentInterface getDepartment();

    void setDepartment(DepartmentInterface department);

    String getCompany();

}
