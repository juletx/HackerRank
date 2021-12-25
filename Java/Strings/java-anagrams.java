

    static boolean isAnagram(String a, String b) {
        char aa[] = a.toLowerCase().toCharArray();
        char bb[] = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(aa);
        java.util.Arrays.sort(bb);
        return java.util.Arrays.equals(aa,bb);
    }

