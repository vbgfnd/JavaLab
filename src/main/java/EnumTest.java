public enum EnumTest {

    中文,
    爸爸("ddd");

    private String val;
    EnumTest(String ddd) {
        this.val = ddd;
    }
    public String getValue(){
        return val;
    }
    EnumTest(){
        this.val = this.toString();
    }
}
