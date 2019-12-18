public class User {
    private String nick;
    private String state;
    private String room;

    private String buffer;

    User(String nick) {
        this.nick = nick;
        this.state = "init";
        this.room = "";
        this.buffer = "";
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBuffer() {
        return buffer;
    }

    public void setBuffer(String buffer) {
        this.buffer = buffer;
    }

}
