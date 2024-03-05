class BuilderExample {
    public static void main(String[] args) {
        FormBuilder fBuilder = new FormBuilder();
        StudentsButtonsBuilder bBuilder = new StudentsButtonsBuilder();
        bBuilder.addButtons();
        StudentsWMBuilder wmBuilder = new StudentsWMBuilder();
        fBuilder.setButtonsBuilder(bBuilder);
        fBuilder.setWMBuilder(wmBuilder);
        fBuilder.constructForm();
        Form form = fBuilder.getForm();
        System.out.println(form.welcomeMessage);
        for (var button : form.buttonList)
            System.out.println(button.getName());
    }
}
