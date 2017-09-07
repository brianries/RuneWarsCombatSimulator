package rwcsim.base;

import java.util.*;

public class RuleSetManager {
    private static Map<String,Rule> allRules = new HashMap<>();
    private static Set<String> enabledRules = new HashSet<>();

    public static Set<String> getRuleNames() {
        return allRules.keySet();
    }

    public static List<Rule> getAllRules() {
        List<Rule> blah = new ArrayList<>();
        blah.addAll(allRules.values());
        return blah;
    }

    public static Rule getRule(String name) {
        return allRules.get(name);
    }

    public static Rule getRuleIfEnabled(String name) {
        if (enabledRules.contains(name)) {
            return allRules.get(name);
        }
        return null;
    }

    public static boolean isEnabled(String name) {
        return enabledRules.contains(name);
    }

    public static void addRule(Rule rule) {
        allRules.put(rule.name(), rule);
    }

    public static void addRule(Rule rule, boolean enable) {
        allRules.put(rule.name(), rule);
        if (enable) enabledRules.add(rule.name());
    }

    public static void enableRule(String name) {
        if (allRules.containsKey(name)) {
            enabledRules.add(name);
        }
    }
}
