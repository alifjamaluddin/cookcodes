library ieee;
use ieee.std_logic_1164.all;

entity latchen_tb is			-- entity declaration
end latchen_tb;

-------------------------------------------------------------------

architecture tb of latchen_tb is


component latchen
    port (
	en: in std_ulogic;
        a: in std_ulogic_vector(2 downto 0);
        b: in std_ulogic_vector(2 downto 0);
        ans: out std_ulogic_vector(3 downto 0)
    );
end component;

signal s_en:std_ulogic;		
signal s_a, s_b:std_ulogic_vector(2 downto 0);
signal s_ans:std_ulogic_vector(3 downto 0);

begin

    U_latch: latchen port map (s_en, s_a, s_b, s_ans);
	
    process


    begin

        s_en<='1';
        s_a<="010";
        s_b<="001";
	wait for 20 ns;

        s_en<='0';
        s_a<="011";
        s_b<="001";
	wait for 10 ns;   --30ns

        s_en<='0';
        s_a<="011";
        s_b<="101";
	wait for 5 ns;   --35ns
	
        s_en<='1';
        s_a<="011";
        s_b<="101";
	wait for 15 ns;   --50ns

        s_en<='1';
        s_a<="011";
        s_b<="110";
	wait for 10 ns;   --60ns

        s_en<='0';
        s_a<="100";
        s_b<="110";
	wait for 20 ns;   --80ns


        s_en<='1';
        s_a<="100";
        s_b<="110";
	wait for 20 ns;   --80ns
	wait;

    end process;

end tb;

