class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(int i=0 ; i<strs.size() ; i++) {
            int tempLength = strs.get(i).length();
            encodedString.append(tempLength).append(',');
        }

        encodedString.append('/');

        for(int i=0; i<strs.size(); i++) {
            encodedString.append(strs.get(i));
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {

        if(str.length() == 0) return new ArrayList<>();

        List<String> decodedString = new ArrayList<>();
        List<Integer> stringLengths = new ArrayList<>();
        int i=0;
        while(str.charAt(i) != '/') {
            StringBuilder size = new StringBuilder();
            while(str.charAt(i) != ',') {
                size.append(str.charAt(i));
                i++;
            }
            stringLengths.add(Integer.parseInt(size.toString()));
            i++;
        }
        i++;
        for(int size : stringLengths) {
            decodedString.add(str.substring(i, i + size));
            i = i + size;
        }

        return decodedString;

    }
}
