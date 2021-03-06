package rwcsim.basicutils.managers;

import rwcsim.basicutils.concepts.Manager;
import rwcsim.basicutils.concepts.Rule;

import java.util.*;

public class RuleSetManager implements Manager {
    private static boolean useSeed = false;

    private static final long seed = 5567001l;
    private static Random random = new Random(seed);
    public static final long randomSeed = System.nanoTime();
    private static Random fullRandom = new Random(randomSeed);

    private static Map<String,Rule> allRules = new HashMap<>();
    private static Set<String> enabledRules = new HashSet<>();

    public static void resetFullRandom(long newseed) {
        fullRandom = new Random(newseed);
    }

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

    public static int getInt() {
        if (useSeed) { return random.nextInt(); }
        return fullRandom.nextInt();
    }

    public static int getBoxedInt(int max) {
        if (useSeed) { return random.nextInt(max); }
        return fullRandom.nextInt(max);
    }



}
