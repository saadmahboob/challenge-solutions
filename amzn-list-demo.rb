require 'pry'

class Node
  attr_accessor :data, :next
  
  def initialize(data)
    self.data = data
  end

end

class ListDemo
  attr_accessor :head

  def append(data)
    puts "Appending #{data}"
    if @head
      temp = @head
      while temp.next do
	temp = temp.next
      end
      temp.next = Node.new data
    else
      @head = Node.new data
    end
  end

  def delete_middle
    if @head.nil?
      puts "Empty List"
      return
    end
    
    temp1 = @head
    temp2 = @head
    prev = temp1	    
    while(temp1.next && temp2.next && temp2.next.next) do
      temp1 = temp1.next
      temp2 = temp2.next.next      
    end
    puts "Deleting middle #{temp1.data}"
    
    if temp1 == @head
       @head = @head.next
    else
      prev.next = temp1.next
    end
  end

  def show
    temp = @head
    while(temp) do
      print "#{temp.data} -> "	
      temp = temp.next
    end
    puts
  end

end

list = ListDemo.new
# list.show
list.append(11)
list.append(22)
list.delete_middle
list.show
list.append(33)
list.append(44)
list.append(55)
list.show
list.delete_middle
list.show
list.append(66)
list.show
list.delete_middle
list.show
list.delete_middle
list.show
list.append(77)
list.show
