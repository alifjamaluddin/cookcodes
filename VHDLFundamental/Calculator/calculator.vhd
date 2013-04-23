-- Quartus II VHDL Template
-- Unsigned Adder

library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

entity calculator is

	generic
	(
		DATA_WIDTH : natural := 4
	);

	port 
	(
		x	   : in std_logic_vector((DATA_WIDTH) downto 0);
		y	   : in std_logic_vector((DATA_WIDTH) downto 0);
		en		: in std_logic;
		res 	: in std_logic;
		s	   : out std_logic_vector((DATA_WIDTH) downto 0);
		
	);

end entity;

architecture rtl of calculator  is
begin
cal:PROCESS(en, res)


VARIABLE enres : in std_logic;
begin
enres := en&res;

CASE enres IS
WHEN "11" => 
s <=x+y; 

WHEN "10" => a;
x<="0000";
y<="0000";
s <=x+y; 
WHEN OTHERS => s <= "0000";
END CASE;
END PROCESS cal;
END rtl;
