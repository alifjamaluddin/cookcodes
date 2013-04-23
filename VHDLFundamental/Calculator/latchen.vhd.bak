
library ieee;
use ieee.std_logic_1164.all;
USE ieee.numeric_std.ALL;

entity latchen is
    port (
	en: in std_ulogic;
        a: in std_ulogic_vector(2 downto 0);
        b: in std_ulogic_vector(2 downto 0);
        ans: out std_ulogic_vector(3 downto 0)
    );

end latchen;

architecture BEHAVIOR of latchen is

-- Note: signals, components and other objects may be declared here if needed.


signal s_a,s_b: integer;
signal s_ans: integer;



begin

s_a <= to_integer(unsigned(a));
s_b <= to_integer(unsigned(b));
process(s_a,s_b,en)
begin
	if en='1' then
		s_ans<= s_a+s_b;
	end if;

end process;

ans <= std_ulogic_vector(to_unsigned(s_ans,4)); 


end BEHAVIOR;

