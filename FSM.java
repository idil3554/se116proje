import java.io.Serializable;
import java.util.*;

public class FSM implements Serializable {
    private static final long serialVersionUID = 1L;

    public Set<String> symbols = new LinkedHashSet<>();
    public Set<String> states = new LinkedHashSet<>();
    public String initialState;
    public Set<String> finalStates = new LinkedHashSet<>();
    public Map<String, Map<String, String>> transitions = new HashMap<>();

    public void clear() {
        symbols.clear();
        states.clear();
        initialState = null;
        finalStates.clear();
        transitions.clear();
    }

    public Set<String> getSymbols() { return symbols; }
    public Set<String> getStates() { return states; }
    public String getInitialState() { return initialState; }
    public Set<String> getFinalStates() { return finalStates; }
    public Map<String, Map<String, String>> getTransitions() { return transitions; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("SYMBOLS ");
        for (String symbol : getSymbols()) {
            sb.append(symbol).append(" ");
        }
        sb.append("\n");

        sb.append("STATES ");
        for (String state : getStates()) {
            sb.append(state).append(" ");
        }
        sb.append("\n");

        sb.append("INITIAL STATE: ");
        sb.append(getInitialState() != null ? getInitialState() : "undefined");
        sb.append("\n");

        sb.append("FINAL STATES: ");
        for (String finalState : getFinalStates()) {
            sb.append(finalState).append(" ");
        }
        sb.append("\n");

        sb.append("TRANSITIONS:\n");
        for (var entry : getTransitions().entrySet()) {
            for (var sub : entry.getValue().entrySet()) {
                sb.append(entry.getKey()).append(" ").append(sub.getKey()).append(" ").append(sub.getValue()).append("\n");
            }
        }

        return sb.toString();
    }
}