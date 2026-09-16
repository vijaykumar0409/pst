
class BrowserHistory {

    private String[] history;
    private int current;
    private int end;

    public BrowserHistory(String homepage) {
        history = new String[5001];
        history[0] = homepage;
        current = 0;
        end = 0;
    }

    public void visit(String url) {
        current++;
        history[current] = url;
        end = current;
    }

    public String back(int steps) {
        current = Math.max(0, current - steps);
        return history[current];
    }

    public String forward(int steps) {
        current = Math.min(end, current + steps);
        return history[current];
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna