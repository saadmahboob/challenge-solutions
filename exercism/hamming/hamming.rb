class Hamming
  VERSION = 2.0

  def self.compute(arg1, arg2)
    raise ArgumentError if arg1.length != arg2.length
    count = 0
    arg1.length.times do |index|
      count += 1 if arg1[index] != arg2[index]
    end
    count
  end

end
