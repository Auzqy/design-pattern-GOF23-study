package top.auzqy.design.pattern.behavioral.command.example1;

public class OnlineVideoCommand implements Command {
    private Video video;

    public OnlineVideoCommand(Video video) {
        this.video = video;
    }

    @Override
    public void execute() {
        video.online();
    }
}
