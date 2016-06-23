class IterateSequenceDemo
  attr_accessor :sequence

  def initialize(arr)
    self.sequence = arr
  end

  def iterate_sequence(count = sequence.length-1)
    temp = sequence.dup
    count.times do
      puts "temp: #{temp}"
      temp.each_with_index do |num, index|
        if index < (temp.length - 1)
	  temp[index] = temp[index+1] - num
	else
          temp.delete_at(index)
	end	  
      end
    end
    puts "temp: #{temp}"
    temp.inject(0){ |sum, i| sum + i }
  end

end

demo = IterateSequenceDemo.new([11,2,23,14,5,36])
puts "iterate sequence sum: #{demo.iterate_sequence()}"
