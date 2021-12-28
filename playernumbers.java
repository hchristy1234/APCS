// first part
for (int i = 0; i < slots.length; i++) {
    if (slots[i] == null) {
        Player p = new Player(playerName, i);
        slots[i] = p;
        return p;
    }
}
waitingList.add(playerName);
return null;


// second part
int i = p.getPlayerNumber();
if (waitingList.size() != 0) {
    slots(i) = new Player(waitingList.get(0), i);
    waitingList.remove(0);
}
else {
    slots[i] = null;
}
return slots[i];

// other part
ArrayList<Integer> x = new ArrayList<IntegeR>();
for (int i = 0; i < sentence.length; i++) {
    if (sentence.substring(i, i+1).equals(" ")) {
        x.add(i);
    }
    return x;
}

// next part
return getBlankSpaces().size()+1;

ArrayList<Integer> p = getBlankPositions();
int n = countWords();
String[] x = new String[n];
for (int i = 0; i < n; i++) {
    if (i == 0) {
        if (p.size() != 0) {
            x[i] = sentence.substring(0, p.get(0));
        }
        else {
            x[i] = sentence;
        }
    }
    else if (i = p.size()) {
        x[i] = sentence.substring(p.get(i-1));
    }
    else {
        x[i] = sentence.substring(p.get(i-1), p.get(i));
    }
    return x;
}