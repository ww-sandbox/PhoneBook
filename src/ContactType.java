public enum ContactType {
    PRIV("Prywatny"), MOBI("Komórkowy"), WORK("Służbowy");

        private String fullname;
        ContactType(String name){
            fullname = name;
        }

    public String getFullname() {
        return fullname;
    }
}
