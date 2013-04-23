library ieee;
use ieee.std_logic_1164.ALL;
entity bcd is
Port( 

x0 : in std_logic;
x1 : in std_logic;
x2 : in std_logic;
x3 : in std_logic;
k0 : in std_logic;
k1 : in std_logic;


output : out std_logic_vector(6 downto 0)

);
end bcd;

ARCHITECTURE behave OF bcd IS
BEGIN
mux:PROCESS(x1, x2, x3, x0)

VARIABLE sel : STD_LOGIC_VECTOR(3 DOWNTO 0);
BEGIN
sel := x0 & x1 & x2 & x3; 
CASE sel IS
WHEN "0000" => output <= "1000000";
WHEN "0001" => output <= "1111001";
WHEN "0010" => output <= "0100100";
WHEN "0011" => output <= "0110000";
WHEN "0100" => output <= "0011001";
WHEN "0101" => output <= "0010010";
WHEN "0110" => output <= "0000010";
WHEN "0111" => output <= "1111000";
WHEN "1000" => output <= "0000000";
WHEN OTHERS => output <= "0000110";
END CASE;




END PROCESS mux;
END behave;