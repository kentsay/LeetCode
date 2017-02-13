public class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<Character> row1 = new ArrayList<>();
        ArrayList<Character> row2 = new ArrayList<>();
        ArrayList<Character> row3 = new ArrayList<>();
        row1.add('q');row1.add('w');row1.add('e');row1.add('r');row1.add('t');
        row1.add('y');row1.add('u');row1.add('i');row1.add('o');row1.add('p');
        row2.add('a');row2.add('s');row2.add('d');row2.add('f');row2.add('g');
        row2.add('h');row2.add('j');row2.add('k');row2.add('l');
        row3.add('z');row3.add('x');row3.add('c');row3.add('v');
        row3.add('b');row3.add('n');row3.add('m');

        for (String word: words) {
            char[] W = word.toLowerCase().toCharArray();
            boolean inRow = true;
            int row = 0;
            if (row1.contains(W[0]))
                row = 1;
            else if (row2.contains(W[0]))
                row = 2;
            else if (row3.contains(W[0]))
                row = 3;

            for (int i=1; i<W.length; i++) {
                switch (row) {
                    case 1:
                        if (!row1.contains(W[i]))
                            inRow = false;
                        break;
                    case 2:
                        if (!row2.contains(W[i]))
                            inRow = false;
                        break;
                    case 3:
                        if (!row3.contains(W[i]))
                            inRow = false;
                        break;
                }
            }
            if (inRow)
                result.add(word);
        }
        String[] temp = new String[result.size()];
        for (int i=0; i<result.size(); i++) {
            temp[i] = result.get(i);
        }
        return temp;
    }
}
