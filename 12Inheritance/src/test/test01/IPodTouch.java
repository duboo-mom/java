package test.test01;

public class IPodTouch {

    private String maker;
    private String model;

    public IPodTouch() {
        this.maker = "apple";
        this.model = "iPodTouch";
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void internetBrowsing(String url) {
        System.out.println(url + " �ε���...");
        System.out.println("�ε� �Ϸ�");
    }

    public void playMusic(String musicName) {
        System.out.println(musicName + " ��� ����");
    }

    public String infoString() {
        return this.maker + " - " + this.model;
    }
}
