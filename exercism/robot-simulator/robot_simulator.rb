class Simulator

  COMMAND_MAP = {
    'L' => :turn_left,
    'R' => :turn_right,
    'A' => :advance
  }

  def instructions(commands)
    commands.split('').map do |cmd|
      COMMAND_MAP[cmd]
    end
  end

  def place(robot, options = {})
    robot.at(options[:x], options[:y])
    robot.bearing = options[:direction]
  end

  def evaluate(robot, commands)
    self.instructions(commands).each do |cmd|
      robot.send(cmd)
    end
  end

end

class Robot
  attr_accessor :coordinates, :bearing
  
  DIRECTIONS = [:north, :east, :south, :west]

  def initialize
    self.at(0, 0)
    self.bearing = DIRECTIONS.first
  end

  def orient(direction)
    raise ArgumentError unless DIRECTIONS.include?(direction)  
    self.bearing = direction
    # change coordinates
  end

  def at(x, y)
    self.coordinates = [x, y]
    # change bearing position
  end

  def advance
    # move coordinates depeding upon bearing position
    x, y = self.coordinates
    case self.bearing
    when :north
      self.coordinates = [x, y + 1]
    when :east
      self.coordinates = [x + 1, y]
    when :south
      self.coordinates = [x, y - 1]
    when :west
      self.coordinates = [x - 1, y]
    end
  end

  %w(left right).each do |direction|
    define_method("turn_#{direction}".to_sym) do
      index = DIRECTIONS.index(self.bearing)
      if direction == "left"
        index = index - 1
      else
	index = index + 1
      end
      index = index % DIRECTIONS.length
      self.bearing = DIRECTIONS[index]
    end
  end

end
