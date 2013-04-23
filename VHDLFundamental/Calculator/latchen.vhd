
library ieee;
use ieee.std_logic_1164.all;
USE ieee.numeric_std.ALL;

entity latchen is
    port (
	en: in std_logic;
        a: in std_logic;
        b: in std_logic;
        ans: out std_logic_vector(3 downto 0)
    );

end latchen;

architecture BEHAVIOR of latchen is

-- Note: signals, components and other objects may be declared here if needed.


signal s_a,s_b: std_logic;
signal s_ans: std_logic_vector(3 downto 0);



begin

s_a<= a;
s_b<= b;

process(s_a,s_b,en)

begin
	if en='1' then
		s_ans<= s_a+s_b;
	end if;

end process;

ans <= s_ans; 


end BEHAVIOR;

