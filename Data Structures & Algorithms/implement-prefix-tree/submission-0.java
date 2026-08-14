class PrefixTree {
    ArrayList<String>map;
    public PrefixTree() {
         map = new ArrayList<String>();
    }

    public void insert(String word) {
        map.add(word);
    }

    public boolean search(String word) {
        return map.contains(word);
    }

    public boolean startsWith(String prefix) {
        for(int a=0;a<map.size();a++)
            if(map.get(a).indexOf(prefix)==0)
                return true;
        return false;
    }
}
