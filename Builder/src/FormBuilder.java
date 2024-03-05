public class FormBuilder {
    ButtonsBuilder buttonsBuilder;
    WelcomeMessageBuilder welcomeMessageBuilder;
    Form form;

    public void setButtonsBuilder(ButtonsBuilder bBuilder) {
        buttonsBuilder = bBuilder;
    }

    public void setWMBuilder(WelcomeMessageBuilder wmBuilder) {
        welcomeMessageBuilder = wmBuilder;
    }

    public void constructForm() {
        form = new Form();
        form.welcomeMessage = welcomeMessageBuilder.printWM();
        form.buttonList = buttonsBuilder.listButtons;

    }

    public Form getForm() {
        return form;
    }
}
