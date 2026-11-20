public class Obraz {
    private final String path;
    private int likeNum;

    public Obraz(String path, int likeNum) {
        this.path = path;
        this.likeNum = likeNum;
    }
    public Obraz(String path) {
        this.path = path;
        this.likeNum = 0;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }
}
