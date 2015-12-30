
# Given x = 2 ** p + 3 ** q
# We have to find nth smallest value of x which satisfies that equation

n = gets.chomp.to_i
# n = 5 if n.empty?

p = q = 1

x = 2 ** p + 3 ** q
list = []

n.times do |o_count|
	n.times do |i_count|
		list.push(2 ** o_count + 3 ** i_count)
	end
end

list = list.uniq.sort

p list

p "nth Smallest no. : " + list[n-1].to_s
