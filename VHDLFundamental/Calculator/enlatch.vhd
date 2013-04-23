-- Quartus II VHDL Template
-- Unsigned Adder

library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

entity calculator is

	generic
	(
		DATA_WIDTH : natural := 3
	);

	port 
	(
		x	   : in std_logic_vector((DATA_WIDTH) downto 0);
		y	   : in std_logic_vector((DATA_WIDTH) downto 0);
		en		: in std_logic;
		s	   : out std_logic_vector((DATA_WIDTH) downto 0);
		
	);

end entity;

architecture rtl of calculator  is
begin

process(en)

begin
	if en='1' then
		s<= x+y;
	end if;

end process;

end BEHAVIOR;
END rtl;
