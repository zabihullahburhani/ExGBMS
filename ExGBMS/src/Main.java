import com.formdev.flatlaf.FlatLightLaf;
import exgbms.Dashboard;
import exgbms.Login;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {

        try {
            // فعال کردن FlatLaf و گرد کردن گوشه‌ها
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Component.arc", 20);
            UIManager.put("Button.arc", 20);
            UIManager.put("TextComponent.arc", 20);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // باز کردن فرم اصلی
        new Login().setVisible(true);
        new Dashboard().setVisible(true);
    }
}
