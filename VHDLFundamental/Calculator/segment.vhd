library ieee;
use ieee.std_logic_1164.ALL;
entity segment is
Port( 

x : in std_logic_vector(3 downto 0);
output : out std_logic_vector(6 downto 0)

);
end segment;

ARCHITECTURE behave OF segment IS
BEGIN
mux:PROCESS(x)

VARIABLE sel : STD_LOGIC_VECTOR(3 DOWNTO 0);
BEGIN
sel := x;
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