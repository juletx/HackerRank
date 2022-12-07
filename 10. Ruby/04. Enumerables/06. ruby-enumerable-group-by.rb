def group_by_marks(marks, pass_marks)
    # your code here
    marks.group_by do |name, mark|
        if mark >= pass_marks
            'Passed'
        else
            'Failed'
        end
    end
end