

library ieee;
use ieee.std_logic_1164.all;

entity TOPARC is
    port (
		en: in std_logic;
        a: in std_logic_vector(3 downto 0);
        b: in std_logic_vector(3 downto 0);
        ans: out std_ulogic_vector(3 downto 0);
		x 		: in std_logic_vector(3 downto 0);
		output : out std_logic_vector(6 downto 0)

    );

end TOPARC;


architecture STRUCTURAL of TOPARC is


component ENLATCH is

port (
			en:std_logic;
        a: std_logic_vector(3 downto 0);
        b: std_logic_vector(3 downto 0);
        ans:std_ulogic_vector(3 downto 0)
);
end component;

component  SEGMENT is

port (
		x 		:std_logic_vector(3 downto 0);
		output :std_logic_vector(6 downto 0)
);
end component;

signal s_ans: std_logic_vector(3 downto 0);

begin

AD: ENLATCH port map (en=>en,a=>a,b=>b,ans=>s_ans);
ST: SEGMENT port map  (x=>s_ans);



end STRUCTURAL;
