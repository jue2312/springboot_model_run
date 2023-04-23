import com.jue.controller.utils.GetModelOrRule;
import com.jue.domain.Model;
import com.jue.domain.ModelAndRule;
import com.jue.domain.Rule;

public class ll {
    public static void main(String[] args) {
        ModelAndRule modelAndRule=new ModelAndRule();
        modelAndRule.setId(1);
        modelAndRule.setName("sda");
        Model model = GetModelOrRule.getModel(modelAndRule);
        System.out.println(model);
        Rule rule = GetModelOrRule.getRule(modelAndRule);
        System.out.println(rule);
    }
}
