import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;

public class ExampleUserTest {

    @Test
    public void test() {
        ExampleUser user = new ExampleUser(Arrays.asList(new SimpleGrantedAuthority("A"),
                                                         new SimpleGrantedAuthority("B")),
                                           "password",
                                           "username",
                                           true,
                                           true,
                                           true,
                                           true);

        assertThat(user.getAuthorities()).containsExactlyInAnyOrder(
                new SimpleGrantedAuthority("A"),
                new SimpleGrantedAuthority("B")
        );
    }
}
