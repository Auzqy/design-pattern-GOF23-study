package top.auzqy.design.pattern.behavioral.state.example3.eg3_3;

import top.auzqy.design.pattern.behavioral.state.example3.eg3_1.State;

public class FireMario implements IMario {

    private MarioStateMachine stateMachine;

    public FireMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public State getName() {
        return State.FIRE;
    }

    @Override
    public void obtainMushRoom() {
        // do nothing...
    }

    @Override
    public void obtainCape() {
        // do nothing...
    }

    @Override
    public void obtainFireFlower() {
        // do nothing...
    }

    @Override
    public void meetMonster() {
        stateMachine.setCurrentState(new FireMario(stateMachine));
        stateMachine.setScore(stateMachine.getScore() - 300);
    }
}
