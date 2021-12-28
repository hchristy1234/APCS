public Player cancelAndReassignSlot(Player p) {
    for (int i = 0; i < slots.length; i++) {
        if (i == p.getPlayerNumber()) {
            if (waitingList.size() == 0) {
                slots[i] = null;
                return null;
            }
            else {
                slots[i] = new Player(waitingList.get(0), i);
                waitingList.remove(0);
                return slots[i];
            }
        }
    }
}