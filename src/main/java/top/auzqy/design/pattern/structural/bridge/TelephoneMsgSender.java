package top.auzqy.design.pattern.structural.bridge;


import java.util.List;

interface MsgSender {
    void send(String message);
}

public class TelephoneMsgSender implements MsgSender {
    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        //...
    }

}
class EmailMsgSender implements MsgSender {
    @Override
    public void send(String message) {
        //...
    }
    // 与TelephoneMsgSender代码结构类似，所以省略...
}
class WechatMsgSender implements MsgSender {
    @Override
    public void send(String message) {
        //...
    }
    // 与TelephoneMsgSender代码结构类似，所以省略...
}

abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}

class SevereNotification extends Notification {
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}

class UrgencyNotification extends Notification {
    public UrgencyNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        //...
    }
    // 与SevereNotification代码结构类似，所以省略...
}
class NormalNotification extends Notification {
    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        //...
    }
    // 与SevereNotification代码结构类似，所以省略...
}
class TrivialNotification extends Notification {
    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        //...
    }
    // 与SevereNotification代码结构类似，所以省略...
}